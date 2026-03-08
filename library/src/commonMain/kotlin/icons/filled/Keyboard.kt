package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Filled.Keyboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.608f, 4.367f)
                curveToRelative(0.867f, -0.117f, 1.97f, -0.117f, 3.337f, -0.117f)
                horizontalLineToRelative(8.11f)
                curveToRelative(1.367f, 0f, 2.47f, 0f, 3.337f, 0.117f)
                curveToRelative(0.9f, 0.12f, 1.658f, 0.38f, 2.26f, 0.981f)
                curveToRelative(0.602f, 0.602f, 0.86f, 1.36f, 0.982f, 2.26f)
                curveToRelative(0.116f, 0.867f, 0.116f, 1.97f, 0.116f, 3.337f)
                verticalLineToRelative(2.11f)
                curveToRelative(0f, 1.367f, 0f, 2.47f, -0.116f, 3.337f)
                curveToRelative(-0.122f, 0.9f, -0.38f, 1.658f, -0.982f, 2.26f)
                reflectiveCurveToRelative(-1.36f, 0.86f, -2.26f, 0.982f)
                curveToRelative(-0.867f, 0.116f, -1.97f, 0.116f, -3.337f, 0.116f)
                horizontalLineToRelative(-8.11f)
                curveToRelative(-1.367f, 0f, -2.47f, 0f, -3.337f, -0.116f)
                curveToRelative(-0.9f, -0.122f, -1.658f, -0.38f, -2.26f, -0.982f)
                reflectiveCurveToRelative(-0.86f, -1.36f, -0.981f, -2.26f)
                curveToRelative(-0.117f, -0.867f, -0.117f, -1.97f, -0.117f, -3.337f)
                verticalLineToRelative(-2.11f)
                curveToRelative(0f, -1.367f, 0f, -2.47f, 0.117f, -3.337f)
                curveToRelative(0.12f, -0.9f, 0.38f, -1.658f, 0.981f, -2.26f)
                curveToRelative(0.602f, -0.602f, 1.36f, -0.86f, 2.26f, -0.981f)
                moveTo(5f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(11f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(17f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(5f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(10f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(16f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(7f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
