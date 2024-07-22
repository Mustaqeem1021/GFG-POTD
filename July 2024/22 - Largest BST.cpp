class Solution{
public:
    int ans = 0;
    vector<int> solve(Node* root) {
        vector<int> left {root->data, INT_MIN, 0};
        if (root->left) {
            left = solve(root->left);
        }
        vector<int> right {INT_MAX, root->data, 0};
        if (root->right) {
            right = solve(root->right);
        }
        
        if (root->data > left[1] && root->data < right[0]) {
            ans = max(ans, left[2]+right[2]+1);
            return {left[0], right[1], left[2]+right[2]+1};
        }
        return {INT_MIN, INT_MAX, 0};
    }
    
    int largestBst(Node *root)
    {
        if (!root) return 0;
    	solve(root);
    	
    	return ans;
    }
};
