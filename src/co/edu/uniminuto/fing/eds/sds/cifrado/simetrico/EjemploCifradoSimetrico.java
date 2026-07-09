package co.edu.uniminuto.fing.eds.sds.cifrado.simetrico;

import javax.crypto.SecretKey;
import java.util.Base64;

public class EjemploCifradoSimetrico {
	
	 public static void main(String[] args) throws Exception {

         	System.out.println("=== Demostracion de criptosistema simetrico AES ===\n");
		 
         	// 1) Generacion de la UNICA clave secreta compartida
         	SecretKey clave = AESUtil.generarClave();
	        String mensajeOriginal = "La información confidencial de la empresa.";
	        System.out.println("Mensaje original:");
	        System.out.println(mensajeOriginal);

	        System.out.println();

	        // Mostrar clave
	        String claveBase64 = Base64.getEncoder().encodeToString(clave.getEncoded());

	        System.out.println("Clave AES:");
	        System.out.println(claveBase64);
	        System.out.println();

            // 2) Proceso de CIFRADO (usando la clave secreta)
	        String mensajeCifrado = AESUtil.cifrar(mensajeOriginal, clave);
	        System.out.println("Mensaje cifrado:");
	        System.out.println(mensajeCifrado);
	        System.out.println();

	         // 3) Proceso de DESCIFRADO (usando la MISMA clave secreta)
	        String mensajeDescifrado = AESUtil.descifrar(mensajeCifrado, clave);
	        System.out.println("Mensaje descifrado:");
	        System.out.println(mensajeDescifrado);
	        System.out.println();
	        
	        // Se hace la verificacion de que el ciclo de cifrado/descifrado es correcto.
            System.out.println("\n¿Coincide con el original? " + mensajeOriginal.equals(mensajeDescifrado));	        
            System.out.println();
	        
	        System.out.println("=== Termina la demostracion del criptosistema simétrico AES ===\n");
	 }
}
