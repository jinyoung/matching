<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <Date label="시작일" v-model="value.startDate" :editMode="editMode"/>
        <Date label="종료일" v-model="value.endDate" :editMode="editMode"/>

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
import Date from './primitives/Date.vue'

export default {
    name: 'Contract',
    mixins:[BaseEntity],
    components:{
        String,
        Date,
    },
    
    data: () => ({
        path: "contracts"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
