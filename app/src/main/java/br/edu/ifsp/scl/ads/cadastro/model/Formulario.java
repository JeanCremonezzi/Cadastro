package br.edu.ifsp.scl.ads.cadastro.model;

public class Formulario {
    private String name;
    private String phone;
    private String email;
    private Boolean joinEmailList;
    private String sex;
    private String city;
    private String uf;

    public Formulario() {}

    public static Formulario getInstance(String name, String phone, String email, boolean joinList, String sex, String city, String uf) {
        Formulario form = new Formulario();

        form.setName(name);
        form.setPhone(phone);
        form.setEmail(email);
        form.setJoinEmailList(joinList);
        //form.setSex(Sex.valueOf(sex));
        form.setSex(sex);
        form.setCity(city);
        form.setUf(uf);

        return form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getJoinEmailList() {
        return joinEmailList;
    }

    public void setJoinEmailList(Boolean joinEmailList) {
        this.joinEmailList = joinEmailList;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Valores inseridos:" +
                "\nNome: " + this.name +
                "\nTelefone: " + this.phone +
                "\nEmail: " + this.email +
                "\nIngressa na lista de emails: " + this.joinEmailList +
                "\nSexo: " + this.sex +
                "\nCidade: " + this.city +
                "\nUF: " + this.uf;
    }
}
