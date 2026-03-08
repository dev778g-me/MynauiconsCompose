package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Framer: ImageVector
    get() {
        if (_Framer != null) {
            return _Framer!!
        }
        _Framer = ImageVector.Builder(
            name = "Filled.Framer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.522f, 1.289f)
                lineToRelative(5.17f, 5.011f)
                horizontalLineTo(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(6.3f)
                curveToRelative(0f, 0.235f, 0.108f, 0.445f, 0.278f, 0.583f)
                lineToRelative(6.493f, 5.394f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.75f, 21f)
                verticalLineToRelative(-4.65f)
                horizontalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.522f, -1.289f)
                lineToRelative(-5.17f, -5.011f)
                horizontalLineTo(18.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _Framer!!
    }

@Suppress("ObjectPropertyName")
private var _Framer: ImageVector? = null
