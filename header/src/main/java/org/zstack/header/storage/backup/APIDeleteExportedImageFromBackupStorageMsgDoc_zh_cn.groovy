package org.zstack.header.storage.backup

import org.zstack.header.storage.backup.APIDeleteExportedImageFromBackupStorageEvent

doc {
    title "DeleteExportedImageFromBackupStorage"

    category "storage.backup"

    desc "在这里填写API描述"

    rest {
        request {
			url "DELETE /v1/backup-storage/{backupStorageUuid}/exported-images/{imageUuid}"


            header (OAuth: 'the-session-uuid')

            clz APIDeleteExportedImageFromBackupStorageMsg.class

            desc ""
            
			params {

				column {
					name "backupStorageUuid"
					enclosedIn ""
					desc "镜像存储UUID"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "imageUuid"
					enclosedIn ""
					desc "镜像UUID"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
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
            clz APIDeleteExportedImageFromBackupStorageEvent.class
        }
    }
}