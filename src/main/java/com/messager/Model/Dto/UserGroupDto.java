package com.messager.Model.Dto;

import com.messager.Model.Enum.UserGroupEnum;
import com.messager.Model.ORM.ORMDto;

import javax.persistence.*;

@Entity
@Table(name = "`users.groups`")
public class UserGroupDto extends ORMDto
{
		/**
		 * Наименование группы пользователей
		 */
		@Column(name = "Name", columnDefinition = "enum('Admin','User')")
		@Enumerated(EnumType.STRING)
		private UserGroupEnum userGroupEnum;
}

