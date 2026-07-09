package co.edu.uniminuto.fing.eds.sds.cifrado.simetrico;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * Ejemplo funcional de un criptosistema simetrico (clave privada) usando AES.
 *
 * AES (Advanced Encryption Standard) es el algoritmo simetrico mas usado a
 * nivel industrial. Usa UNA MISMA clave secreta tanto para cifrar como para
 * descifrar la informacion.
 *
 * Este ejemplo usa el modo AES, que ademas de cifrar, garantiza la
 * integridad y autenticidad del mensaje (cifrado autenticado).
 *
 * @author Diego Alejandro Amaya Arjona
 * @version 1.0
 * @since Julio 13 de 2026.
 *
 */
public class AESUtil {

	// Tamano de la clave simetrica en bits (128, 192 o 256)
    private static final int TAMAÑO_CLAVE = 256;
	
	/**
	 * Genera una clave AES de 256 bits.
	 */
	public static SecretKey generarClave() throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(TAMAÑO_CLAVE);
		return keyGenerator.generateKey();
	}

	/**
	 * Cifra un texto plano usando AES con la clave secreta proporcionada.
     *
	 * @param texto
	 * @param clave
	 * @return
	 * @throws Exception
	 */
	public static String cifrar(String texto, SecretKey clave) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, clave);
		byte[] textoCifrado = cipher.doFinal(texto.getBytes("UTF-8"));
		return Base64.getEncoder().encodeToString(textoCifrado);
	}

    /**
     * Descifra un texto cifrado usando AES con la MISMA clave secreta usada 
     * para cifrar. Este es el principio central de un criptosistema simetrico.
	 * 
	 * @param textoCifrado
	 * @param clave
	 * @return
	 * @throws Exception
	 */
	public static String descifrar(String textoCifrado, SecretKey clave) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, clave);
		byte[] bytes = Base64.getDecoder().decode(textoCifrado);
		byte[] textoPlano = cipher.doFinal(bytes);
		return new String(textoPlano,  "UTF-8");
	}

}