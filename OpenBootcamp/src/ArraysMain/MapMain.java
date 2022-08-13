package ArraysMain;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.Soundbank;

public class MapMain {

	public static void main(String[] args) {

		
		Map<String, String> personas = new HashMap<>();
		
		// put() --- Nos permite especificar una clave
		personas.put("36.614.532", "Gonzalo Rigobello");
		personas.put("12.345.678", "Delfina Medina");
		personas.put("12.345.6789", "Benjamin");
		System.out.println(personas);
		
		
		// Con un for y el keySet() sacamos las claves
		for(String key : personas.keySet()) {
			System.out.println(key);
		}
		
		
		// Con un for y el values() sacamos los valores
		for(String value : personas.values()) {
			System.out.println(value);
		}
		
		
		// obtenemos el par clave/valor del mapa
		
		for (Map.Entry<String, String> pair : personas.entrySet()) {
			System.out.println(pair.getKey() + " / " + pair.getValue());
		}
		
		
		
		
		
		
	}

}
