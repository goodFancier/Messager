package com.messager.Model.Dto;

import com.messager.Model.Enum.UserGroupEnum;
import com.messager.Model.ORM.ORMDto;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserDto extends ORMDto
{
		/**
		 * Логин пользователя
		 */
		@Column(name = "UserName")
		private String userName;

		/**
		 * Хеш пароля пользователя
		 */
		@Column(name = "Password")
		private String password;

		/**
		 * Имя пользователя
		 */
		@Column(name = "FirstName")
		private String firstName;

		/**
		 * Фамилия пользователя
		 */
		@Column(name = "LastName")
		private String lastName;

		/**
		 * E-mail пользователя
		 */
		@Column(name = "Email")
		private String email;

		/**
		 * Наименование группы, в которой состоит пользователей
		 */
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "UserGroup")
		private UserGroupEnum userGroup;

		public String getEmail()
		{
				return email;
		}

		public void setEmail(String email)
		{
				this.email = email;
		}

		public String getPassword()
		{
				return password;
		}

		public void setPassword(String password)
		{
				this.password = password;
		}

		public String getFirstName()
		{
				return firstName;
		}

		public void setFirstName(String firstName)
		{
				this.firstName = firstName;
		}

		public String getLastName()
		{
				return lastName;
		}

		public void setLastName(String lastName)
		{
				this.lastName = lastName;
		}

		public String getUserName()
		{
				return userName;
		}

		public void setUserName(String userName)
		{
				this.userName = userName;
		}

		public UserGroupEnum getUserGroup()
		{
				return userGroup;
		}

		public void setUserGroup(UserGroupEnum userGroup)
		{
				this.userGroup = userGroup;
		}
}
