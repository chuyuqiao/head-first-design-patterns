package com.design.patterns.builder;

/**
 * 生成器模式
 * {@link org.springframework.beans.factory.support.BeanDefinitionBuilder}
 */
public class Programmer {
    public static void main(String[] args){
        Programmer programmer = new Programmer.ProgrammerBuilder().setFirstName("F").setLastName("L")
                .setCity("City").setZipCode("0000A").setAddress("Street 39")
                .setLanguages(new String[] {"bash", "Perl"}).setProjects(new String[] {"Linux kernel"}).build();
        System.out.println(programmer);
    }
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String city;
    private String[] languages;
    private String[] projects;

    private Programmer(String fName, String lName, String addr, String zip, String city, String[] langs, String[] projects) {
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.zipCode = zip;
        this.city = city;
        this.languages = langs;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return this.firstName + " "+this.lastName;
    }

    private static class ProgrammerBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String zipCode;
        private String city;
        private String[] languages;
        private String[] projects;

        public ProgrammerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProgrammerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProgrammerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public ProgrammerBuilder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public ProgrammerBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public ProgrammerBuilder setLanguages(String[] languages) {
            this.languages = languages;
            return this;
        }
        public ProgrammerBuilder setProjects(String[] projects) {
            this.projects = projects;
            return this;
        }

        public Programmer build() {
            return new Programmer(firstName, lastName, address, zipCode, city, languages, projects);
        }
    }
}
