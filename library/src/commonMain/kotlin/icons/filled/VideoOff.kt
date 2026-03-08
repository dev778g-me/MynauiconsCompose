package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.VideoOff: ImageVector
    get() {
        if (_VideoOff != null) {
            return _VideoOff!!
        }
        _VideoOff = ImageVector.Builder(
            name = "Filled.VideoOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 2.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.237f, 2.702f)
                lineTo(2.47f, 20.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(3.03f, -3.03f)
                horizontalLineToRelative(6.94f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, -2.75f)
                verticalLineToRelative(-1.594f)
                lineToRelative(3.419f, 3.045f)
                curveToRelative(0.805f, 0.717f, 2.081f, 0.145f, 2.081f, -0.934f)
                verticalLineTo(7.365f)
                curveToRelative(0f, -1.08f, -1.276f, -1.651f, -2.081f, -0.934f)
                lineTo(16.25f, 9.476f)
                verticalLineTo(8.81f)
                lineToRelative(5.28f, -5.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.061f)
                lineToRelative(-4.523f, 4.523f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5.5f)
                close()
            }
        }.build()

        return _VideoOff!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOff: ImageVector? = null
