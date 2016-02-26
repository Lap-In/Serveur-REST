package fr.univ_lille.iut;

class User {
	private String login;
	private String name;
	private String mail;

	public User(String login, String name, String mail) {
		this.login = login;
		this.name = name;
		this.mail = mail;
	}

	public User() {}

	public String getLogin() {
		return login;
	}

	public String setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public String setMail(String mail) {
		this.mail = mail;
	}

	public boolean equals(Object u) {
		return login.equals(((User) u).login) || name.equals(((User) u).name) || mail.equals(((User) u).mail);
	}

	public String toString() {
		return login + " " + name + " " + mail;
	}
}