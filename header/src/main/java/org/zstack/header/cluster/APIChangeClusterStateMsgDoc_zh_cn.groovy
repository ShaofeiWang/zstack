package org.zstack.header.cluster

import org.zstack.header.cluster.APIChangeClusterStateEvent

doc {
    title "ChangeClusterState"

    category "cluster"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/clusters/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIChangeClusterStateMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "changeClusterState"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "stateEvent"
					enclosedIn "changeClusterState"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					values ("enable","disable")
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
            clz APIChangeClusterStateEvent.class
        }
    }
}