package com.zzy.book.web;

import com.zzy.book.entity.Book;
import com.zzy.book.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author zzy
 * @date 2019/6/24
 */
@Controller
@RequestMapping("/book")
public class BookController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BookService bookService;

    @RequestMapping(value="/list",method = RequestMethod.GET)
    private String list(Model model){
        List<Book> list = bookService.getList();
        model.addAttribute("list",list);
        return "list";//web-inf/jsp/list.jsp
    }

    @RequestMapping(value="/{bookId}/detail",method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId,Model model){
        if(bookId==null){
            return "redirect:/book/list";
        }
        Book book = bookService.getById(bookId);
        if(book==null){
            return "forward:/book/list";
        }
        model.addAttribute("book",book);
        return "detail";
    }

}
