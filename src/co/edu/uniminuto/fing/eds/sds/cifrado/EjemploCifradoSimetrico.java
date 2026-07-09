package co.edu.uniminuto.fing.eds.sds.cifrado;

import javax.crypto.SecretKey;
import java.util.Base64;

public class EjemploCifradoSimetrico {
	
	 public static void main(String[] args) throws Exception {

         	System.out.println("=== Demostracion de criptosistema simetrico AES ===\n");
		 
	        // Generar clave
	        SecretKey clave = AESUtil.generarClave();

	        String mensaje = "La información confidencial de la empresa.";

	        System.out.println("Mensaje original:");
	        System.out.println(mensaje);

	        System.out.println();

	        // Mostrar clave
	        String claveBase64 = Base64.getEncoder().encodeToString(clave.getEncoded());

	        System.out.println("Clave AES:");
	        System.out.println(claveBase64);

	        System.out.println();

	        // Cifrar
	        String mensajeCifrado = AESUtil.cifrar(mensaje, clave);

	        System.out.println("Mensaje cifrado:");
	        System.out.println(mensajeCifrado);

	        System.out.println();

	        // Descifrar
	        String mensajeDescifrado = AESUtil.descifrar(mensajeCifrado, clave);

	        System.out.println("Mensaje descifrado:");
	        System.out.println(mensajeDescifrado);
	        System.out.println();
            System.out.println("=== Termina la demostracion del criptosistema simétrico AES ===\n");
	 }
}
