package org.zstack.header.storage.backup

import org.zstack.header.storage.backup.APIReconnectBackupStorageEvent

doc {
    title "ReconnectBackupStorage"

    category "storage.backup"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/backup-storage/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIReconnectBackupStorageMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "reconnectBackupStorage"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
 					enclosedIn ""
 					desc ""
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIReconnectBackupStorageEvent.class
        }
    }
}