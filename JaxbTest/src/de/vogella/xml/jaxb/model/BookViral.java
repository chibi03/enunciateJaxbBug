package de.vogella.xml.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Indicates if the Book in question is currently going viral
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BookViral {

	@XmlElement(name="viral")
	private boolean isViral;

	/**
	 * 
	 * @return states if the Book is currently viral
	 */
	public boolean getViral() {
		return isViral;
	}

	public void setViral(boolean isViral) {
		this.isViral = isViral;
	}
	
}
