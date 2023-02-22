/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Modellizzare la classe Blog e la classe Article
La classe Blog presenta:
- Article[] articles
+ addArticle(Article article)*/
package com.mycompany.app;

public class Blog {
    private int initialCount = 0;
    private Article[] articles;

    public Blog() {
        this.articles = new Article[initialCount+20]; 
    }
    
    public void addArticle(Article article){
        if(articles.length < initialCount){
             this.articles[initialCount] = article;
             initialCount++;
        }
    }
}
