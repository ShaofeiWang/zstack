package org.zstack.network.securitygroup

import org.zstack.network.securitygroup.APIDeleteVmNicFromSecurityGroupEvent

doc {
    title "DeleteVmNicFromSecurityGroup"

    category "securityGroup"

    desc "在这里填写API描述"

    rest {
        request {
			url "DELETE /v1/security-groups/{securityGroupUuid}/vm-instances/nics"


            header (OAuth: 'the-session-uuid')

            clz APIDeleteVmNicFromSecurityGroupMsg.class

            desc ""
            
			params {

				column {
					name "securityGroupUuid"
					enclosedIn ""
					desc "安全组UUID"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "vmNicUuids"
					enclosedIn ""
					desc ""
					location "body"
					type "List"
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
            clz APIDeleteVmNicFromSecurityGroupEvent.class
        }
    }
}