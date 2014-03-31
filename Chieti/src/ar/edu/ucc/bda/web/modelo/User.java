package ar.edu.ucc.bda.web.modelo;

import java.io.Serializable;
//clase java q tengo intencion de mandar por la red: serializar. -->implementar serializable (cuando la creo)
// la guarda de otra forma en memoria.
//new class ADD serializable.java...
// para guardar en la secion... request... para que tomcat las pueda guardar si se queda sin memoria


public class User implements Serializable {
		private int userId;
		private String name;
		private String lastName;
		private String address;
		private String user;
		private String password;
		private UserType type;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
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
		public UserType getType() {
			return type;
		}
		public void setType(UserType type) {
			this.type = type;
		}
	
   

}
