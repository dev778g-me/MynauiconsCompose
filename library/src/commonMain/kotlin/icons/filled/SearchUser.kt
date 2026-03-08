package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchUser: ImageVector
    get() {
        if (_SearchUser != null) {
            return _SearchUser!!
        }
        _SearchUser = ImageVector.Builder(
            name = "Filled.SearchUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 10f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.25f, 11.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.578f, 5.294f)
                lineToRelative(2.675f, 2.676f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-2.678f, -2.678f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 11.5f)
                moveToRelative(8.25f, -4.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.01f, 4.627f)
                quadToRelative(-0.286f, 0.164f, -0.54f, 0.382f)
                curveToRelative(-0.734f, 0.629f, -1.2f, 1.563f, -1.2f, 2.741f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.752f, 0.284f, -1.266f, 0.676f, -1.603f)
                curveToRelative(0.408f, -0.35f, 0.977f, -0.543f, 1.574f, -0.543f)
                reflectiveCurveToRelative(1.166f, 0.193f, 1.574f, 0.543f)
                curveToRelative(0.392f, 0.337f, 0.676f, 0.85f, 0.676f, 1.603f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -1.178f, -0.466f, -2.112f, -1.2f, -2.741f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -0.382f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 7.25f)
            }
        }.build()

        return _SearchUser!!
    }

@Suppress("ObjectPropertyName")
private var _SearchUser: ImageVector? = null
