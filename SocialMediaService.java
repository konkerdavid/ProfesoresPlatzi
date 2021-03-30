/**
 * 
 */
package com.platzi.profesoresplatzi.service;

import java.util.List;

import com.platzi.profesoresplatzi.model.SocialMedia;
import com.platzi.profesoresplatzi.model.TeacherSocialMedia;

/**
 * @author david
 *
 */
public interface SocialMediaService {

	void saveSocialMedia (SocialMedia socialMedia);
	
	void deleteSocialMediaById (Long idSocialMedia);
	
	void updateSocialMedia (SocialMedia socialMedia);
	
	List<SocialMedia> findAllSocialMedias ();
	
	SocialMedia findById (Long idSocialMedia);
	
	SocialMedia finfByName (String name);
	
	TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickName); 	
}
