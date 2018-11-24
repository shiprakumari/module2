package com.cg.sessionschedular.model;

	

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;



	@Entity
	@Table(name="session_details")
	public class Session {
		@Id
		@Column(name="session_id")
		private Integer id;
		
		private String name;
		private Integer duration;
		private String faculty;
		private String mode;
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
		public Integer getDuration() {
			return duration;
		}
		public void setDuration(Integer duration) {
			this.duration = duration;
		}
		public String getFaculty() {
			return faculty;
		}
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			this.mode = mode;
		}
		@Override
		public String toString() {
			return "Session [id=" + id + ", name=" + name + ", duration="
					+ duration + ", faculty=" + faculty + ", mode=" + mode + "]";
		}
		
		
		
		
	}


