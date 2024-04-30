<template>
    <div>
        <String label="프로젝트ID" v-model="value.projectId" :editMode="editMode"/>
        <String label="제목" v-model="value.title" :editMode="editMode"/>
        <String label="기간" v-model="value.duration" :editMode="editMode"/>
        <String label="담당자" v-model="value.manager" :editMode="editMode"/>
        <String label="클라이언트" v-model="value.client" :editMode="editMode"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'
import String from './primitives/String.vue'
import Money from './vo/Money.vue'
import Email from './vo/Email.vue'

export default {
    name: 'Project',
    mixins:[BaseEntity],
    components:{
        String,
        Money,
        Email,
    },
    
    data: () => ({
        path: "projects"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
