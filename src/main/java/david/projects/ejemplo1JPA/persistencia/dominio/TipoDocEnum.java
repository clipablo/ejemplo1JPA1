package david.projects.ejemplo1JPA.persistencia.dominio;

import java.util.ArrayList;
import java.util.List;

public enum TipoDocEnum {

	DNI, LC, LE;

	/**
	 * transforma los valores del enumerado y lso devuelve en una lista
	 * 
	 * @return a strings list
	 */
	public static List<String> getValuesAsList() {
		List<String> list = new ArrayList<String>();
		for (TipoDocEnum elem : TipoDocEnum.values()) {
			list.add(elem.toString());
		}
		return list;
	}

	/**
	 * obtiene y devuekve una isntacia de TipoDoc a partir de un valor
	 * 
	 * @param value
	 *            the looked value
	 * @return the corresponding id card type
	 */
	public static TipoDocEnum get(String value) {
		// @TODO validate this parameter!!
		if (value == null) {
			return null;
		}
		return TipoDocEnum.valueOf(value);
	}
}