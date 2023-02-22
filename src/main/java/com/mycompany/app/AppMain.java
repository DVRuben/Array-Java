/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

/**
 *
 * @author Mauro
 */
public class AppMain {

    public static void main(String[] args) {
        Blog newBlog = new Blog();
        for(int i = 0; i < 200; i++){
           Article newArticle = new Article();
           newBlog.addArticle(newArticle);
        }
    }
}
