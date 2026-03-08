package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Ribbon: ImageVector
    get() {
        if (_Ribbon != null) {
            return _Ribbon!!
        }
        _Ribbon = ImageVector.Builder(
            name = "Filled.Ribbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.801f, 11.495f)
                lineToRelative(0.94f, 6.051f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.009f, 0.115f)
                curveToRelative(0f, 0.496f, -0.274f, 0.869f, -0.54f, 1.106f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.933f, 0.528f)
                curveToRelative(-0.33f, 0.117f, -0.688f, 0.19f, -1.03f, 0.204f)
                curveToRelative(-0.323f, 0.014f, -0.716f, -0.021f, -1.053f, -0.205f)
                lineToRelative(-2.106f, -1.147f)
                arcToRelative(0.18f, 0.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.176f, 0f)
                lineToRelative(-2.106f, 1.147f)
                curveToRelative(-0.337f, 0.184f, -0.73f, 0.22f, -1.054f, 0.206f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.029f, -0.205f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.932f, -0.528f)
                curveToRelative(-0.267f, -0.237f, -0.541f, -0.61f, -0.541f, -1.106f)
                quadToRelative(0f, -0.057f, 0.009f, -0.115f)
                lineToRelative(0.94f, -6.051f)
                arcTo(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.25f)
                moveToRelative(4.213f, 17.645f)
                lineToRelative(0.022f, -0.02f)
                lineToRelative(-0.787f, -5.07f)
                arcTo(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.75f)
                arcToRelative(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.448f, -0.946f)
                lineToRelative(-0.787f, 5.07f)
                lineToRelative(0.022f, 0.021f)
                curveToRelative(0.084f, 0.075f, 0.234f, 0.164f, 0.438f, 0.236f)
                curveToRelative(0.2f, 0.071f, 0.411f, 0.112f, 0.591f, 0.12f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.271f, -0.024f)
                horizontalLineToRelative(0.001f)
                lineToRelative(2.106f, -1.147f)
                arcToRelative(1.68f, 1.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.612f, 0f)
                lineToRelative(2.106f, 1.147f)
                curveToRelative(0.012f, 0.004f, 0.094f, 0.032f, 0.272f, 0.024f)
                curveToRelative(0.18f, -0.008f, 0.391f, -0.049f, 0.59f, -0.12f)
                curveToRelative(0.205f, -0.072f, 0.355f, -0.16f, 0.44f, -0.236f)
            }
        }.build()

        return _Ribbon!!
    }

@Suppress("ObjectPropertyName")
private var _Ribbon: ImageVector? = null
