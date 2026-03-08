package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MobileSignalOne: ImageVector
    get() {
        if (_MobileSignalOne != null) {
            return _MobileSignalOne!!
        }
        _MobileSignalOne = ImageVector.Builder(
            name = "Outline.MobileSignalOne",
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
            }
        }.build()

        return _MobileSignalOne!!
    }

@Suppress("ObjectPropertyName")
private var _MobileSignalOne: ImageVector? = null
