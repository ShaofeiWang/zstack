package org.zstack.network.service.eip

import org.zstack.header.errorcode.ErrorCode
import org.zstack.header.vm.VmNicInventory

doc {

	title "在这里输入结构的名称"

	ref {
		name "error"
		path "org.zstack.network.service.eip.APIGetEipAttachableVmNicsReply.error"
		desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null",false
		type "ErrorCode"
		since "0.6"
		clz ErrorCode.class
	}
	ref {
		name "inventories"
		path "org.zstack.network.service.eip.APIGetEipAttachableVmNicsReply.inventories"
		desc "null"
		type "List"
		since "0.6"
		clz VmNicInventory.class
	}
}
