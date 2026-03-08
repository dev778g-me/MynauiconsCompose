package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MobileSignalTwo: ImageVector
    get() {
        if (_MobileSignalTwo != null) {
            return _MobileSignalTwo!!
        }
        _MobileSignalTwo = ImageVector.Builder(
            name = "Outline.MobileSignalTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                verticalLineToRelative(-1f)
                moveToRelative(4.5f, 1f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _MobileSignalTwo!!
    }

@Suppress("ObjectPropertyName")
private var _MobileSignalTwo: ImageVector? = null
