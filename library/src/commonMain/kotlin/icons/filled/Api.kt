package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Api: ImageVector
    get() {
        if (_Api != null) {
            return _Api!!
        }
        _Api = ImageVector.Builder(
            name = "Filled.Api",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(2.01f, -2.011f)
                curveToRelative(-0.774f, -1.073f, -0.908f, -2.265f, -0.753f, -3.29f)
                curveToRelative(0.178f, -1.172f, 0.743f, -2.2f, 1.243f, -2.7f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.061f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.5f, 0.5f, -1.527f, 1.065f, -2.699f, 1.243f)
                curveToRelative(-1.025f, 0.155f, -2.217f, 0.02f, -3.29f, -0.754f)
                close()
                moveTo(11.03f, 10.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineTo(11.44f, 8f)
                lineToRelative(-0.47f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.5f, -0.5f, 1.527f, -1.065f, 2.699f, -1.243f)
                curveToRelative(1.025f, -0.155f, 2.217f, -0.02f, 3.29f, 0.754f)
                lineToRelative(2.01f, -2.011f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.061f, 1.06f)
                lineToRelative(-2.01f, 2.012f)
                curveToRelative(0.774f, 1.072f, 0.91f, 2.264f, 0.754f, 3.29f)
                curveToRelative(-0.178f, 1.171f, -0.743f, 2.198f, -1.243f, 2.698f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                lineToRelative(-0.47f, -0.47f)
                lineToRelative(-1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(1.47f, -1.47f)
                lineToRelative(-2.44f, -2.44f)
                close()
            }
        }.build()

        return _Api!!
    }

@Suppress("ObjectPropertyName")
private var _Api: ImageVector? = null
