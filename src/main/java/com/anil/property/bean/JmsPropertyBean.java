/**
 * 
 */
package com.anil.property.bean;

/**
 * @author Anil_Ramesh
 *
 */

public class JmsPropertyBean {

	private String jmsuser;

	@Override
	public String toString() {
		return "JmsPropertyBean [jmsuser=" + jmsuser + ", jmspassword=" + jmspassword + ", jmsurl=" + jmsurl + "]";
	}

	public String getJmsuser() {
		return jmsuser;
	}

	public void setJmsuser(String jmsuser) {
		this.jmsuser = jmsuser;
	}

	public String getJmspassword() {
		return jmspassword;
	}

	public void setJmspassword(String jmspassword) {
		this.jmspassword = jmspassword;
	}

	public String getJmsurl() {
		return jmsurl;
	}

	public void setJmsurl(String jmsurl) {
		this.jmsurl = jmsurl;
	}

	private String jmspassword;
	private String jmsurl;

}
