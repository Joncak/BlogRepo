package com.nisum.blog.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.blog.model.Comment;
import com.nisum.blog.model.News;
import com.nisum.blog.persistance.INews;

@Service
public class NewsServiceImpl implements INewsService {

	
	@Autowired
	private INews newsPersistence;
	
	@Override
	public News create(News miNoticiaAGuardar) throws RuntimeException {
		
		return newsPersistence.create(miNoticiaAGuardar);
		
	}

	@Override
	public News delete(int i) throws RuntimeException {
		return newsPersistence.delete(i);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public News read(int i) throws RuntimeException {
		return newsPersistence.read(i);
	}

	@Override
	public ArrayList<News> readAll() {
		return newsPersistence.readAll();
	}

	@Override
	public Comment addComment(int id, Comment nuevoComentario) throws RuntimeException {
		return newsPersistence.addComment(id, nuevoComentario);
	}

	@Override
	public News searchNewsbyTag(int id, String tag) {
		// TODO Auto-generated metuhod stub
		return null;
	}

}