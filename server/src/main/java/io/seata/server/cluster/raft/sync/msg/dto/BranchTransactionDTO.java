/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server.cluster.raft.sync.msg.dto;

import io.seata.core.store.BranchTransactionDO;

/**
 * @author jianbin.chen
 */
public class BranchTransactionDTO extends BranchTransactionDO {

    private static final long serialVersionUID = 4550610938263777969L;
    private String lockKey;

    public BranchTransactionDTO(String xid, long branchId) {
        super(xid, branchId);
    }

    public BranchTransactionDTO() {
        super();
    }

    public String getLockKey() {
        return lockKey;
    }

    public void setLockKey(String lockKey) {
        this.lockKey = lockKey;
    }

}
