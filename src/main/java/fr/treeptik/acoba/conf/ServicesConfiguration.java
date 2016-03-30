package main.java.fr.treeptik.acoba.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@ComponentScan("main.java.fr.treeptik.acoba")
@EnableWebMvc
public class ServicesConfiguration {
//	@Bean
//	public ArticleServiceImpl articleServiceImpl(ArticleDAO repository) throws IOException, SQLException{
//		return new ArticleServiceImpl(repository);
//	}
//	@Bean
//	public AuthorServiceImpl authorServiceImpl(AuthorDAO repository) throws IOException, SQLException{
//		return new AuthorServiceImpl(repository);
//	}
//	@Bean
//	public CommentServiceImpl commentServiceImpl(CommentDAO repository) throws IOException, SQLException{
//		return new CommentServiceImpl(repository);
//	}
//	@Bean
//	public CategoryServiceImpl categoryServiceImpl(CategoryDAO repository) throws IOException, SQLException{
//		return new CategoryServiceImpl(repository);
//	}
}
