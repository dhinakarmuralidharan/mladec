package com.test.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.Book;
import com.test.BookMapper;

@Component
public class BookDao {
	private JdbcTemplate jdbcTemplate;
	
	public BookDao(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	public boolean createBook(Book book) {
		String sql = "insert into book1(b_name, B_price) values (? , ?)";
		return jdbcTemplate.update(sql, book.getB_name(), book.getB_price())>0;
	}
	public List<Book> getAllBooks()
	{
		String sql = "select * from book1";
		return jdbcTemplate.query(sql, new BookMapper());
	}
	

}
