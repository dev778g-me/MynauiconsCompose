package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.XTwitter: ImageVector
    get() {
        if (_XTwitter != null) {
            return _XTwitter!!
        }
        _XTwitter = ImageVector.Builder(
            name = "Filled.XTwitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.57f, 4.488f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, -0.976f)
                lineToRelative(-5.368f, 6.274f)
                lineToRelative(-5.224f, -5.938f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.357f, -0.598f)
                horizontalLineTo(5.007f)
                curveToRelative(-0.68f, 0f, -1.264f, 0.352f, -1.56f, 0.885f)
                arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.204f, 1.795f)
                lineToRelative(6.286f, 7.147f)
                lineToRelative(-5.507f, 6.435f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.14f, 0.976f)
                lineToRelative(5.368f, -6.274f)
                lineToRelative(5.224f, 5.938f)
                curveToRelative(0.345f, 0.392f, 0.85f, 0.598f, 1.357f, 0.598f)
                horizontalLineToRelative(1.474f)
                curveToRelative(0.681f, 0f, 1.264f, -0.352f, 1.56f, -0.885f)
                arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, -1.795f)
                lineToRelative(-6.287f, -7.146f)
                close()
            }
        }.build()

        return _XTwitter!!
    }

@Suppress("ObjectPropertyName")
private var _XTwitter: ImageVector? = null
