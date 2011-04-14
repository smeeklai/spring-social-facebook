/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook.support.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.facebook.EventInviteeMixin;
import org.springframework.social.facebook.types.Album;
import org.springframework.social.facebook.types.EducationEntry;
import org.springframework.social.facebook.types.Event;
import org.springframework.social.facebook.types.EventInvitee;
import org.springframework.social.facebook.types.FacebookProfile;
import org.springframework.social.facebook.types.Group;
import org.springframework.social.facebook.types.GroupMemberReference;
import org.springframework.social.facebook.types.Invitation;
import org.springframework.social.facebook.types.Reference;
import org.springframework.social.facebook.types.UserLike;
import org.springframework.social.facebook.types.WorkEntry;

public class FacebookModule extends SimpleModule {

	public FacebookModule() {
		super("FacebookModule", new Version(1, 0, 0, null));
	}
	
	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(FacebookProfile.class, FacebookProfileMixin.class);
		context.setMixInAnnotations(WorkEntry.class, WorkEntryMixin.class);
		context.setMixInAnnotations(EducationEntry.class, EducationEntryMixin.class);
		context.setMixInAnnotations(Reference.class, ReferenceMixin.class);
		context.setMixInAnnotations(GroupMemberReference.class, GroupMemberReferenceMixin.class);
		context.setMixInAnnotations(Album.class, AlbumMixin.class);
		context.setMixInAnnotations(UserLike.class, UserLikeMixin.class);
		context.setMixInAnnotations(Group.class, GroupMixin.class);
		context.setMixInAnnotations(Event.class, EventMixin.class);
		context.setMixInAnnotations(Invitation.class, InvitationMixin.class);
		context.setMixInAnnotations(EventInvitee.class, EventInviteeMixin.class);
	}
}
