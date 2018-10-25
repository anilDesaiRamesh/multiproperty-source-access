/**
 * 
 */
package com.anil.property.bean;

/**
 * @author Anil_Ramesh
 *
 */
public class PropertyBean {

	private String user;
	private String password;
	@Override
	public String toString() {
		return "PropertyBean [user=" + user + ", password=" + password + ", url=" + url + ", environmentProp="
				+ environmentProp + "]";
	}
	private String url;
	private String environmentProp;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getEnvironmentProp() {
		return environmentProp;
	}
	public void setEnvironmentProp(String environmentProp) {
		this.environmentProp = environmentProp;
	}

}
