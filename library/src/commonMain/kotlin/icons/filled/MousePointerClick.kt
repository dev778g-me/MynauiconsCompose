package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MousePointerClick: ImageVector
    get() {
        if (_MousePointerClick != null) {
            return _MousePointerClick!!
        }
        _MousePointerClick = ImageVector.Builder(
            name = "Filled.MousePointerClick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.589f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(1.978f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(5.983f, 4.945f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.917f, 6f)
                lineToRelative(1.47f, 1.483f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.452f, 6.43f)
                close()
                moveTo(16.761f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.065f, -1.055f)
                lineToRelative(-1.47f, 1.484f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.065f, 1.055f)
                close()
                moveTo(11.8f, 10.096f)
                curveToRelative(-1.025f, -0.404f, -1.994f, 0.617f, -1.61f, 1.61f)
                lineToRelative(3.581f, 9.25f)
                curveToRelative(0.41f, 1.058f, 1.901f, 1.059f, 2.311f, 0f)
                lineToRelative(1.374f, -3.543f)
                lineToRelative(3.508f, -1.385f)
                curveToRelative(1.048f, -0.414f, 1.048f, -1.903f, 0f, -2.317f)
                close()
                moveTo(4.96f, 10.163f)
                lineTo(3f, 10.163f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.96f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                moveToRelative(2.492f, 5.234f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.065f, -1.056f)
                lineToRelative(-1.47f, 1.484f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.066f, 1.056f)
                close()
            }
        }.build()

        return _MousePointerClick!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointerClick: ImageVector? = null
