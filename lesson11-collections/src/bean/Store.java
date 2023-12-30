package bean;

import java.util.Objects;

public class Store {
		private Integer id;
		private String name;
		
		public Store() {
			// TODO Auto-generated constructor stub
		}

		public Store(Integer id, String name) {
			this.id = id;
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (!(o instanceof Store)) {
				return false;
			}
			Store that = (Store)o;
			return getId().equals(that.getId());
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(getId());
		}
		
		@Override
		public String toString() {
			return "Store [id=" + id + ", name=" + name + "]";
		}
		
		
}
