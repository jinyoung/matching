<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: '프로젝트및개발자' }" />
        <VerticalNavLink
            :item="{
                title: '프로젝트',
                to: '/projects',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '계약' }" />
        <VerticalNavLink
            :item="{
                title: '계약',
                to: '/contracts',
            }"
        />
    </ul>
</template>
