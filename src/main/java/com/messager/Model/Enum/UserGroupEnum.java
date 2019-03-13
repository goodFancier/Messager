package com.messager.Model.Enum;

public enum UserGroupEnum
{
		Admin("Администраторы"), User("Пользователи");

		UserGroupEnum(String title)
		{
				this.title = title;
		}

		private String title;

		public static UserGroupEnum getByString(String state)
		{
				if(state == null)
						return null;
				for(UserGroupEnum element : UserGroupEnum.values())
						if(element.name().equalsIgnoreCase(state) || element.getTitle().equalsIgnoreCase(state))
								return element;
				return null;
		}

		@Override
		public String toString()
		{
				return getTitle();
		}

		public String getTitle()
		{
				return title;
		}
}
