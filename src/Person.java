public abstract class Person {
        private String name;
        private int id;

        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public Person() {
            this("Unknown", 0);
        }

        public Person(Person person) {
            this(person.name, person.id);
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String toString() {

            return name + id;
        }

        public boolean equals(Object obj) {
            if (obj == this)
                return true;

            if (!(obj instanceof Person))
                return false;

            Person person = (Person) obj;

            return name.equals(person.name);
        }




    }


