package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MobileSignalFive: ImageVector
    get() {
        if (_MobileSignalFive != null) {
            return _MobileSignalFive!!
        }
        _MobileSignalFive = ImageVector.Builder(
            name = "Outline.MobileSignalFive",
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
                moveToRelative(18f, 1f)
                verticalLineTo(3f)
                moveToRelative(-9f, 18f)
                verticalLineToRelative(-9f)
                moveToRelative(4.5f, 9f)
                verticalLineTo(8f)
                moveToRelative(-9f, 13f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _MobileSignalFive!!
    }

@Suppress("ObjectPropertyName")
private var _MobileSignalFive: ImageVector? = null
