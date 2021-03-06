package org.zstack.storage.backup.sftp

import org.zstack.header.storage.backup.APIUpdateBackupStorageEvent

doc {
    title "UpdateSftpBackupStorage"

    category "storage.backup.sftp"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/backup-storage/sftp/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIUpdateSftpBackupStorageMsg.class

            desc ""
            
			params {

				column {
					name "username"
					enclosedIn "updateSftpBackupStorage"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "password"
					enclosedIn "updateSftpBackupStorage"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "hostname"
					enclosedIn "updateSftpBackupStorage"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "sshPort"
					enclosedIn "updateSftpBackupStorage"
					desc ""
					location "body"
					type "Integer"
					optional true
					since "0.6"
					
				}
				column {
					name "uuid"
					enclosedIn "updateSftpBackupStorage"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "name"
					enclosedIn "updateSftpBackupStorage"
					desc "资源名称"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "updateSftpBackupStorage"
					desc "资源的详细描述"
					location "body"
					type "String"
					optional true
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
            clz APIUpdateBackupStorageEvent.class
        }
    }
}