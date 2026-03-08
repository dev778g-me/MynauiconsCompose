package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Hash: ImageVector
    get() {
        if (_Hash != null) {
            return _Hash!!
        }
        _Hash = ImageVector.Builder(
            name = "Filled.Hash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.436f, 4.131f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.477f, -0.262f)
                lineToRelative(-0.74f, 4.162f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(4.953f)
                lineTo(6.9f, 15.47f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3.632f)
                lineToRelative(-0.692f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.477f, 0.262f)
                lineToRelative(0.739f, -4.162f)
                horizontalLineToRelative(5.833f)
                lineToRelative(-0.692f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.476f, 0.262f)
                lineToRelative(0.74f, -4.162f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-5.221f)
                lineToRelative(1.054f, -5.938f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(0.692f, -3.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.477f, -0.262f)
                lineToRelative(-0.739f, 4.162f)
                horizontalLineTo(9.743f)
                close()
            }
        }.build()

        return _Hash!!
    }

@Suppress("ObjectPropertyName")
private var _Hash: ImageVector? = null
