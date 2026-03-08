package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.UsersGroup: ImageVector
    get() {
        if (_UsersGroup != null) {
            return _UsersGroup!!
        }
        _UsersGroup = ImageVector.Builder(
            name = "Filled.UsersGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.75f, 7.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 5.823f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1.118f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 5.59f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1.118f)
                arcTo(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 7.5f)
                moveTo(16f, 3.75f)
                arcToRelative(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 0.955f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1.118f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3.355f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1.117f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 3.75f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.75f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.5f)
                moveToRelative(-5.81f, 7.726f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, -1.452f)
                curveToRelative(-0.97f, 0.255f, -1.836f, 0.682f, -2.474f, 1.256f)
                curveToRelative(-0.64f, 0.575f, -1.086f, 1.336f, -1.086f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.346f, 0.17f, -0.729f, 0.59f, -1.105f)
                curveToRelative(0.42f, -0.378f, 1.054f, -0.71f, 1.85f, -0.92f)
                moveToRelative(12f, -1.45f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, 1.45f)
                curveToRelative(0.796f, 0.21f, 1.43f, 0.542f, 1.85f, 0.92f)
                curveToRelative(0.42f, 0.376f, 0.59f, 0.76f, 0.59f, 1.105f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.884f, -0.446f, -1.645f, -1.086f, -2.22f)
                curveToRelative(-0.638f, -0.574f, -1.504f, -1.001f, -2.474f, -1.255f)
                moveTo(12f, 15.75f)
                curveToRelative(-1.493f, 0f, -2.881f, 0.362f, -3.921f, 0.986f)
                curveToRelative(-1.025f, 0.615f, -1.829f, 1.569f, -1.829f, 2.764f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.462f, 0.316f, -1.007f, 1.1f, -1.478f)
                curveToRelative(0.77f, -0.462f, 1.882f, -0.772f, 3.15f, -0.772f)
                reflectiveCurveToRelative(2.38f, 0.31f, 3.15f, 0.772f)
                curveToRelative(0.784f, 0.47f, 1.1f, 1.017f, 1.1f, 1.478f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -1.195f, -0.804f, -2.15f, -1.829f, -2.764f)
                curveToRelative(-1.04f, -0.624f, -2.428f, -0.986f, -3.921f, -0.986f)
            }
        }.build()

        return _UsersGroup!!
    }

@Suppress("ObjectPropertyName")
private var _UsersGroup: ImageVector? = null
