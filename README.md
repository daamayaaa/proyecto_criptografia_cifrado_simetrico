# proyecto_criptografia_cifrado_simetrico - Seguridad en el Desarrollo de Software
Ejemplo funcional de un criptosistema simetrico (clave privada) usando **Java** desarrollado para la asignatura **Seguridad en el Desarrollo de Software**.

Este ejemplo usa el modo AES, que ademas de cifrar, garantiza la integridad y autenticidad del mensaje (cifrado autenticado).

## Algoritmos Utilizados: **AES** .

---

### Flujo de operación.
* Se genera el mensaje original.
* Se genera 	una clave AES de 256.
* Se hace el cifrado del texto plano usando AES con la clave secreta proporcionada.
* Se hace el cifrado del texto plano usando AES con la clave secreta proporcionada.
* Se hace el descifrado del texto cifrado usando AES con la MISMA clave secreta usada para cifrar. 

Este es el principio central de un criptosistema simetrico.
---

Al ejecutarlo verás en consola: la clave generada, el mensaje original, el texto cifrado en Base64, el texto descifrado, y una comprobación de que coincide con el original — demostrando el principio clave del criptosistema simétrico: una misma clave sirve para cifrar y descifrar.

---

## Ejecución del programa.

Resultado Esperado:
```Mensaje Original: La información confidencial de la empresa.```

## Clave AES.
```lE6O7C3xV2oQf4wz9Qm0l2X4tN7vP8yR6sT1uI9aBcD=```

## Mensaje Cifrado.
```8oM0KzNfM0Hn7If8QXJ+9z1VjXt2eA8xjV0Sm1E3F9o==```

## Mensaje Descifrado.
```La información confidencial de la empresa```


## Crear el proyecto en Eclipse

Para ejecutar en Eclipse:
1. Crear un nuevo "Java Project".
2. Copiar este archivo dentro de la carpeta "src" (paquete por defecto).
3. Click derecho sobre el archivo EjemploCifradoSimetrico -> Run As -> Java Application.