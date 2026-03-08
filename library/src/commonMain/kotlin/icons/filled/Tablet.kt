package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Tablet: ImageVector
    get() {
        if (_Tablet != null) {
            return _Tablet!!
        }
        _Tablet = ImageVector.Builder(
            name = "Filled.Tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.25f, 4.8f)
                curveToRelative(0f, -1.565f, 1.536f, -2.55f, 3.036f, -2.55f)
                horizontalLineToRelative(11.428f)
                curveToRelative(1.5f, 0f, 3.036f, 0.985f, 3.036f, 2.55f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 1.565f, -1.536f, 2.55f, -3.036f, 2.55f)
                lineTo(6.286f, 21.75f)
                curveToRelative(-1.5f, 0f, -3.036f, -0.985f, -3.036f, -2.55f)
                close()
                moveTo(10.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _Tablet!!
    }

@Suppress("ObjectPropertyName")
private var _Tablet: ImageVector? = null
