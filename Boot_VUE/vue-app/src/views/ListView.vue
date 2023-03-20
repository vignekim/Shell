<template>
<div class="container mt-3">
	  <h1 class="display-1 text-center">사용자 목록</h1>
	  <div class="btn-group">
	    <a href="/user/save" class="btn btn-primary">사용자 추가</a>
	  </div>
	  <table class="table table-hover mt-3">
	    <thead class="table-dark">
	      <tr>
	      	<th>이름</th>
	        <th>이메일</th>
	        <th>가입날짜</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr class="cursor-pointer" onclick="location.href = '/user/findById';">
	        <td>스티븐</td>
	        <td>jobs@shellfolder.com</td>
	        <td>2023-02-28</td>
	      </tr>
	      <tr class="cursor-pointer" onclick="location.href = '/user/findById';">
	        <td>에브릴</td>
	        <td>lavigne@shellfolder.com</td>
	        <td>2023-02-27</td>
	      </tr>
	    </tbody>
	  </table>
	</div>
</template>

<script>
import axios from 'axios'

export default {
	created() {
		this.getData()
	},
	methods: {
		getData() {
			axios.get('/api')
				.then((response) => {
					console.log(response)
			})
		}
	},
}

</script>

<style scoped>
tbody > tr {
	cursor: pointer;
}
</style>