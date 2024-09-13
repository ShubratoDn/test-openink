package com.open.ink.payloads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.onneshon.blog.entities.Comment;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BlogDto {	
	
	private int id;
	
	@NotEmpty(message = "Insert blog title")
	@Size(min = 5, message = "Minimum 5 character need for title")
	private String blogTitle;
	
	@NotEmpty(message = "Content can not empty")
	private String blogContent;
	
	private String blogImage;	
	private Date addedDate;
	
	
	private int categoryId;
	
	private CategoryDto category;

//	private UserDto user;
	private UserDtoSecure user;

	private List<Comment> comments = new ArrayList<>();
	
	
}

