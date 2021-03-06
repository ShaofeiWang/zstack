package org.zstack.header.storage.primary

import org.zstack.header.storage.primary.APIAttachPrimaryStorageToClusterEvent

doc {
    title "AttachPrimaryStorageToCluster"

    category "storage.primary"

    desc "在这里填写API描述"

    rest {
        request {
			url "POST /v1/clusters/{clusterUuid}/primary-storage/{primaryStorageUuid}"


            header (OAuth: 'the-session-uuid')

            clz APIAttachPrimaryStorageToClusterMsg.class

            desc ""
            
			params {

				column {
					name "clusterUuid"
					enclosedIn ""
					desc "集群UUID"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "primaryStorageUuid"
					enclosedIn ""
					desc "主存储UUID"
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
            clz APIAttachPrimaryStorageToClusterEvent.class
        }
    }
}