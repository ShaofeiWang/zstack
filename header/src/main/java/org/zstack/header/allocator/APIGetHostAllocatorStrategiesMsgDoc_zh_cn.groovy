package org.zstack.header.allocator

import org.zstack.header.allocator.APIGetHostAllocatorStrategiesReply

doc {
    title "GetHostAllocatorStrategies"

    category "host.allocator"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/hosts/allocators/strategies"


            header (OAuth: 'the-session-uuid')

            clz APIGetHostAllocatorStrategiesMsg.class

            desc ""
            
			params {

				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetHostAllocatorStrategiesReply.class
        }
    }
}